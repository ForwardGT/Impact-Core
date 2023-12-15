package com.impact.util.multis

import com.impact.addon.gt.api.multis.IMachineParallelRecipe
import com.impact.models.RecipeMachineModel
import com.impact.models.RecipeOverclockItem
import com.impact.models.RecipeOverclockItem.Companion.readParams
import com.impact.util.recipe.RecipeHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.RepetitionInfo
import java.util.stream.Collectors

class OverclockCalculateTest {

    val model = RecipeMachineModel()

    @BeforeEach
    fun setUp() {
        model.maxProgressTime = 0
        model.eUt = 0
    }

    @RepeatedTest(value = 9)
    fun calculateOverclockedNessMultiNotParallel(repetitionInfo: RepetitionInfo) {

        val item = NOT_PARALEL[repetitionInfo.currentRepetition - 1]

        Assertions.assertNotNull(item)

        val eU = item.recipeVoltage
        val duration = item.recipeDuration
        val maxVoltage = item.hatchVoltage.toLong() * item.hatchAmperes

        OverclockCalculate.calculateOverclockedNessMulti(eU, duration, 1, maxVoltage, model)

        Assertions.assertEquals(model.eUt, item.resultVoltage)
        Assertions.assertEquals(model.maxProgressTime, item.resultProgress)
    }

    @RepeatedTest(value = 50)
    fun calculateOverclockedNessMultiarallel(repetitionInfo: RepetitionInfo) {

        val item = PARALLEL[repetitionInfo.currentRepetition - 1]

        Assertions.assertNotNull(item)

        val model2 = model.copy(currentParallel = item.currentParallel, maxParallel = item.maxParallel)

        val eU = item.recipeVoltage * item.currentParallel
        val duration = item.recipeDuration
        val maxVoltage = item.hatchVoltage.toLong() * item.hatchAmperes

        OverclockCalculate.calculateOverclockedNessMulti(eU, duration, 1, maxVoltage, model2)

        model2.maxProgressTime = RecipeHelper.calcTimeParallel(model2)

        Assertions.assertEquals(model2.eUt, item.resultVoltage)
        Assertions.assertEquals(model2.maxProgressTime, item.resultProgress)
    }

    companion object {
        private val NOT_PARALEL: List<RecipeOverclockItem> = readParams().filter { it.notParallelFilter() }
        private val PARALLEL: List<RecipeOverclockItem> = readParams()
    }
}

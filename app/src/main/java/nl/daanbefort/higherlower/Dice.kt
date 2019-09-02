package nl.daanbefort.higherlower

class Dice(var currentThrow: Int,
           var lastThrow: Int) {

    private fun rollDice() {
        lastThrow = currentThrow
        currentThrow = (1..6).random()
    }

    /**
     * Calls [rollDice] and checks if the answer is correct.
     */
    fun isHigher(): Boolean {
        rollDice()
        return currentThrow > lastThrow
    }

    /**
     * Calls [rollDice] and checks if the answer is correct.
     */
    fun isLower(): Boolean {
        rollDice()
        return currentThrow < lastThrow
    }

    /**
     * Calls [rollDice] and checks if the answer is correct.
     */
    fun isEqual(): Boolean {
        rollDice()
        return currentThrow == lastThrow
    }
}
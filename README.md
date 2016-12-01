# ATM
Let's write an ATM!

## Description

Let's build a pretend ATM!

But first, enjoy this gif of a Seagull trying to steal some food.

![seagull](http://www.comedycentral.co.uk/sites/default/files/styles/image-w-760-scale/public/cc_uk/galleries/large/2014/11/18/seagull-thief-fail.gif?itok=9ILXq0_4)

## Requirements

* Prompt me for my name
  * If I enter nothing, throw an exception
* 
* Prompt me for what I would like to do
  * 1. Check my balance, 2. Withdraw Funds or 3. Cancel
  * Check Balance
    * Print the current balance to the screen.
  * Cancel
    * Print to the console `"Thank you and please come again." and exit the program.
  * Withdraw Funds
    * Prompt for how much money to withdraw
      * If the amount is greater than what they have, throw an exception
      * If all is well, tell them to please take their money
      * Remove the money from their account
      * Print how much money they have left in their account.
* After they deposit or withdraw funds, prompt them again to deposit, withdraw, or cancel.

**LUDICROUS MODE**  
* Add a static Method to ATM that tells you the smallest number of coins to make up any given input. Add a prompt for this to the ATM list.

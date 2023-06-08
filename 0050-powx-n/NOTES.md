# Approach:

* the iterative binary exponentiation method. It reduces the number of multiplications needed to calculate the power by using the binary representation of the exponent.

* Initialize the result variable to 1.0 and the exponent variable to n.
* If the exponent is negative, convert it to a positive value.
* Iterate while the exponent is greater than 0:
  * If the exponent is odd (exponent % 2 == 1), multiply the result by x and decrement the exponent by 1.
  * Square the value of x and halve the exponent by dividing it by 2.
* If the original exponent (n) was negative, calculate the reciprocal of the result.
* Return the final result.

# Time Complexity: O(log n)
# Space Complexity: O(1)

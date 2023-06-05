* Initialize minPrice as the maximum possible integer value and maxProfit as 0.
* Iterate through each element in the prices array.
* Update minPrice as the minimum value between the current price and the minPrice.
* Update maxProfit as the maximum value between the current price minus minPrice and the current maxProfit.
* After iterating through all prices, the value of maxProfit will represent the maximum profit that can be obtained.

# time complexity of this O(n), where n is the length of the prices array. This is because we iterate through each element of the array once.

# space complexity of this  O(1) because the code uses only a constant amount of extra space for the variables _minPrice_ and _maxProfit_.

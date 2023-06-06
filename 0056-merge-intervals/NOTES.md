# Approach
* Sort the intervals array based on the start times of the intervals in ascending order.
* Initialize an empty list called merged to store the merged intervals.
* Iterate through the sorted intervals.
  * If the current interval's start time is less than or equal to the previous interval's end time, merge the intervals by updating the end time.
  * If the current interval's start time is greater than the previous interval's end time, add the previous merged interval to the result list and update the start and end times with the current interval's start and end times.

* Add the last merged interval to the result list.
* Convert the **merged** list to a 2D array and return it.

#  time complexity is  O(n log n), where n is the number of intervals. This is due to the sorting step performed on the intervals array
#  space complexity is O(n)

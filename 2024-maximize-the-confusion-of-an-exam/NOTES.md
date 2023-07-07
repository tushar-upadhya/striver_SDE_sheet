* We start by initializing the pointers j and count to 0, which represent the start index of the window and the count of 'T' characters encountered so far, respectively. We also initialize the result variable to store the maximum length of consecutive answers.
* We iterate over the answerKey string using the pointer i. This pointer represents the end index of the window.​
* For each character at index i:
  * If the current character is 'T', we increment the count variable to keep track of the number of 'T' characters encountered in the current window.
  * We calculate the number of 'F' characters (zeros) in the current window as i - j + 1 - count. The window size is given by i - j + 1, and we subtract the count of 'T' characters (count) to get the count of 'F' characters (zeros).
  * We calculate the minimum value between count and zeros and store it in the variable min. This represents the maximum number of modifications we can make while still maintaining consecutive answers.
  * If the min value is greater than the allowed number of modifications k, it means we have exceeded the allowed modifications. In this case, we need to move the window's start j to the right, so we increment j by 1. We also adjust the count and zeros variables accordingly by subtracting the count of 'T' characters at the new window start.
  * Finally, we update the result by taking the maximum value between the current result and the length of the current window (i - j + 1). This ensures that we keep track of the maximum length of consecutive answers seen so far.

 * After iterating over the entire answerKey string, we return the result, which represents the maximum length of consecutive answers with at most k modifications.

#  time complexity is O(n)
# space complexity is O(1)

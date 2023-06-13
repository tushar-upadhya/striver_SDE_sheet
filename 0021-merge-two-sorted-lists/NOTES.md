# approach
* The function mergeTwoLists takes two input parameters: list1 and list2, which represent the heads of the two sorted linked lists to be merged.
* The base cases are checked first. If either list1 or list2 is null, it means one of the lists is empty. In such cases, the function simply returns the other non-empty list as the merged result.
* If neither list is empty, the function compares the values of the current nodes of list1 and list2.
* If the value of the current node in list1 is smaller than the value of the current node in list2, it means the current node from list1 should be included in the merged list first.
* In this case, the next pointer of the current node in list1 is updated to the result of recursively merging the remaining portion of list1 (i.e., list1.next) with list2.
* The function returns list1 as the merged list.
* If the value of the current node in list2 is smaller than or equal to the value of the current node in list1, it means the current node from list2 should be included in the merged list first.
* In this case, the next pointer of the current node in list2 is updated to the result of recursively merging list1 with the remaining portion of list2 (i.e., list2.next).
* The function returns list2 as the merged list.
* The recursive process continues until one of the base cases is reached, ultimately merging the two sorted lists into a single sorted list.

# time complexity is O(n + m), where n and m are the lengths of list1 and list2, respectively
#  space complexity is O(n + m) 
https://www.youtube.com/watch?v=Xb4slcp1U38&embeds_referring_euri=https%3A%2F%2Ftakeuforward.org%2Finterviews%2Fstrivers-sde-sheet-top-coding-interview-problems%2F&source_ve_path=MjM4NTE&feature=emb_title

# QuickSort Java Implementation

This project demonstrates how the QuickSort algorithm works using Java. QuickSort is a highly efficient sorting algorithm based on the divide-and-conquer strategy.

---

## 🔧 Features

- Implementation of QuickSort in Java
- Partitioning logic explained in code
- Step-by-step sorting of an integer array
- Easily extendable for other data types or custom comparison logic

---


## 📜 Algorithm Description

QuickSort is a recursive sorting algorithm that works by:

1. **Choosing a Pivot** (in this case, the last element of the array).
2. **Partitioning** the array into two halves:
   - Elements smaller than the pivot go to the left.
   - Elements greater than the pivot go to the right.
3. **Recursively sorting** the sub-arrays.

---



### Input:

int[] arr = { 6, 3, 9, 5, 2, 8 };

Functions Explained
partition(int[] arr, int low, int high)
Picks the last element as pivot.

Rearranges the array so that elements < pivot come before it.

Returns the index of the pivot after rearrangement.

quickSort(int[] arr, int low, int high)
Calls the partition() function.

Recursively sorts the left and right parts of the array.

main(String[] args)
Defines an unsorted array.

Calls quickSort() and prints both unsorted and sorted versions.



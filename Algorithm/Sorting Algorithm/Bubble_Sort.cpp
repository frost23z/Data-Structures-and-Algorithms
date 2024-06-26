#include <bits/stdc++.h>
using namespace std;

/**
 * Sorts a vector of integers using the bubble sort algorithm.
 * @param arr The vector of integers to be sorted.
 *
 * Example:
 * ```
 * vector<int> arr = {5, 4, 3, 2, 1};
 * bubble_sort(arr);
 * // arr is now {1, 2, 3, 4, 5}
 * ```
 */
void bubble_sort(vector<int> &arr)
{
    int n = arr.size();
    for (int i = 0; i < n; i++)
    {
        bool swapped = false;
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(arr[j], arr[j + 1]);
                swapped = true;
            }
        }
        if (!swapped)
        {
            break;
        }
    }
}

/**
 * Prints the elements of a vector.
 * @param arr The vector of integers to be printed.
 *
 * Example:
 * ```
 * vector<int> arr = {1, 2, 3, 4, 5};
 * print(arr);
 * // Output: 1 2 3 4 5
 * ```
 */
void print(vector<int> &arr)
{
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

/**
 * Reads integers from a file and stores them in a vector.
 * @param arr The vector of integers to store the read integers.
 * @param inputFile The input file stream to read integers from.
 *
 * Example:
 * ```
 * vector<int> arr;
 * ifstream inputFile("test.txt");
 * read(arr, inputFile);
 * // The integers from the file "test.txt" are now stored in arr.
 * ```
 */
void read(vector<int> &arr, ifstream &inputFile)
{
    if (!inputFile)
    {
        cerr << "Error opening file" << endl;
        exit(1);
    }
    int num;
    while (inputFile >> num)
    {
        arr.push_back(num);
    }
}

int main()
{
    vector<int> arr;
    ifstream inputFile("test.txt");
    read(arr, inputFile);
    inputFile.close();

    cout << "Before Sorting: ";
    print(arr);
    bubble_sort(arr);
    cout << "After Sorting:  ";
    print(arr);
    return 0;
}
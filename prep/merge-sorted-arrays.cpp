#include<iostream>

using namespace std;

int* merge_sorted_arrays(int*A, int sizeA, int*B, int sizeB) {

}

void print_array(int* arr, int size) {
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }

    cout << endl;
}

int main() {
    int A[] = {1, 2, 3, 12, 13};
    int B[] = {10, 11, 4, 5, 14, 15};
    int sizeA = sizeof(A)/sizeof(A[0]);
    int sizeB = sizeof(B)/sizeof(B[0]);
    int *merged = merge_sorted_arrays(A, sizeA, B, sizeB);
    int sizeMerged = sizeA + sizeB;

    print_array(merged, sizeMerged);
}
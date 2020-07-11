#include<iostream>

using namespace std;

void print_array(int* A, int start, int end);

void swap(int*A, int x, int y) {
    int temp = A[x];
    A[x] = A[y];
    A[y] = temp;
}

int partition(int* A, int start, int end) {
    if(start >= end) {
        return 0;
    }

    int pivot=start, i=end, j=end;

    while(i > pivot) {
        if (A[i] >= A[pivot]) {
            swap(A, i, j--);
        }
        i--;
    }
    
    swap(A, j, pivot);

    return j;
}

void quick_sort(int*A, int start, int end) {
    if (start >= end) {
        return;
    }

    int pivot = partition(A, start, end);
    // print_array(A, start, end);
    // cout << "pivot = " << pivot << endl;
    quick_sort(A, start, pivot-1);
    quick_sort(A, pivot+1, end);
}

void print_array(int* A, int start, int end) {
    for(int i=start; i<=end; i++) {
        cout << A[i] << " ";
    }
    cout << endl;
}

int main() {

    // int A[] = {4, 2, 4, 2, 3, 3, 0, 6, 3, 6};
    int A[] = {5, 21, 27, 21, 7, 14, 14, 14, 12, 7, 7, 22, 28, 16, 22, 4, 14, 8, 3, 14, 28, 14, 12, 28, 15, 19, 27, 4, 16, 3};
    int size = sizeof(A) / sizeof(A[0]);
    quick_sort(A, 0, size-1);

    print_array(A, 0, size-1);

    return 0;
}
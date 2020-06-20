#include<iostream>

using namespace std;

void print(int arr[], int start, int end) {
    cout << "[";
    for(int i=start; i<end; i++)
        cout << arr[i] << (i == end-1 ? "" : ", ");
    cout << "]" << endl;
}

int findProduct(int arr[], int start, int end) {
    int product = 1;

    for(int i=start; i<end; i++)
        product *= arr[i];

    return product;
}

int solve(int arr[], int n) {
    int finalProduct = 1;

    for(int i=0; i<n; i++) {
        int product = 1;
        
        for(int j=i; j<n; j++) {
            print(arr, i, j+1);
            product *= arr[j];
            finalProduct *= product;
            // finalProduct *= findProduct(arr, i, j+1);
        }
    }

    return finalProduct;
}

int main() {
    int arr[] = {10, 3, 7};
    cout << solve(arr, sizeof(arr) / sizeof(arr[0]));

    return 0;
}
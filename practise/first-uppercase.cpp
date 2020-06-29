#include<iostream>

using namespace std;

bool is_upper(char c) {
    return 64 < c && c < 91;
}

char first_uppercase(const char *s) {
    if (*s == '\0')
        return '\0';

    return is_upper(*s) ? *s : first_uppercase(s + 1);
}

int main() {

    const char* inputs[] = {"Manish", "my name is Preeti"};

    int num_inputs = sizeof(inputs) / sizeof(inputs[0]);

    for(int i=0; i<num_inputs; i++) {
        cout << inputs[i] << ": " << first_uppercase(inputs[i]) << endl;
    }

    return 0;
}

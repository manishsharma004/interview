#include<iostream>

using namespace std;

bool is_between(int num, int lower, int upper) {
    return lower <= num && num <= upper;
}

bool is_consonant(char c) {
    return is_between(c, 'B', 'D') || is_between(c, 'F', 'H') || is_between(c, 'J', 'N') || is_between(c, 'P', 'T') || is_between(c, 'V', 'Z') || 
        is_between(c, 'b', 'd') || is_between(c, 'f', 'h') || is_between(c, 'j', 'n') || is_between(c, 'p', 't') || is_between(c, 'v', 'z');
}

int count_consonants(const char *s) {
    if (*s == '\0')
        return 0;

    return (is_consonant(*s) ? 1 :  0) + count_consonants(s + 1);
}

int main() {

    const char* inputs[] = {"Manish", "my name is Preeti", "geeksforgeeks portal"};

    int num_inputs = sizeof(inputs) / sizeof(inputs[0]);

    for(int i=0; i<num_inputs; i++) {
        cout << inputs[i] << ": " << count_consonants(inputs[i]) << endl;
    }

    return 0;
}

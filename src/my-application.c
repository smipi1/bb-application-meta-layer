#include <stdio.h>

#include "secrets.h"

int main() {
	printf("Hello, World!\n");
	printf("Secret is: %s\n", get_secret());
	return 0;
}

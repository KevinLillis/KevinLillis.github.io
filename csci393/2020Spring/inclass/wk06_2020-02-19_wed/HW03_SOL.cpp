#include <iostream>
#include <fstream>
#include <ctime>
using namespace std;

bool uniqueElemets(int[], int);
int* getArray(int);

int main() {
	int lengths[40] = {1200, 2400, 3600, 4800, 6000, 7200, 8400, 9600, 10800,
		12000, 13200, 14400, 15600, 16800, 18000, 19200, 20400, 21600, 22800,
		24000, 25200, 26400, 27600, 28800, 30000, 31200, 32400, 33600, 34800,
		36000, 37200, 38400, 39600, 40800, 42000, 43200, 44400, 45600, 46800,
		48000};
			
	// Create output file
	ofstream outFile{};
	outFile.open("results.csv");
	
	int* array{};
	clock_t start, stop, elapsed;
	outFile << "n,Time" << endl;
	for(int i{0}; i < 40; i++){
		cout << "Length " << lengths[i] << endl;
		array = getArray(lengths[i]);
	
		start = clock();
		uniqueElemets(array, lengths[i]);
		stop = clock();
	
		delete [] array;
	
		elapsed = stop - start;
		outFile << lengths[i] << "," << elapsed << endl;
	}
	
	
	outFile.close();
	return EXIT_SUCCESS;
}

bool uniqueElemets(int array[], int length) {
	for(int i{0}; i < length - 2; i++){
		for(int j{i+1}; j < length; j++){
			if (array[i] == array[j]){
				return false;
			}
		}
	}
	return true;
}

int* getArray(int length){
	int* array = new int[length];
	for(int i{0}; i < length; i++){
		array[i] = i;
	}
	return array;
}
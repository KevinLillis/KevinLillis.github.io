#include <iostream>
#include <cmath>
#include "Temperature.h"
using namespace std;

int errorCount{0};

void check(bool value, bool expected, string message);
void check(double value, double expected, string message );
bool approxEqual(double x, double y);

int main() {
	cout << boolalpha;
	Temperature t1;
	check(t1.get(), 0, "Test 1");
	check(t1.get('K'), 0, "Test 2");
	check(t1.get('k'), 0, "Test 3");
	check(t1.get('F'), -459.67, "Test 4");
	check(t1.get('f'), -459.67, "Test 5");
	check(t1.get('C'), -273.15, "Test 6");
	check(t1.get('c'), -273.15, "Test 7");
	check(t1.get('R'), 0, "Test 8");
	check(t1.get('r'), 0, "Test 9");
	
	Temperature t2(373.15);
	check(t2.get(), 373.15, "Test 10");
	check(t2.get('K'), 373.15, "Test 11");
	check(t2.get('k'), 373.15, "Test 12");
	check(t2.get('F'), 212, "Test 13");
	check(t2.get('f'), 212, "Test 14");
	check(t2.get('C'), 100, "Test 15");
	check(t2.get('c'), 100, "Test 16");
	check(t2.get('R'), 671.67, "Test 17");
	check(t2.get('r'), 671.67, "Test 18");
	
	t2.set(212, 'F');
	check(t2.get(), 373.15, "Test 19");
	check(t2.get('K'), 373.15, "Test 20");
	check(t2.get('k'), 373.15, "Test 21");
	check(t2.get('F'), 212, "Test 22");
	check(t2.get('f'), 212, "Test 23");
	check(t2.get('C'), 100, "Test 24");
	check(t2.get('c'), 100, "Test 25");
	check(t2.get('R'), 671.67, "Test 26");
	check(t2.get('r'), 671.67, "Test 27");

	t2.set(212, 'f');
	check(t2.get(), 373.15, "Test 28");
	check(t2.get('K'), 373.15, "Test 29");
	check(t2.get('k'), 373.15, "Test 30");
	check(t2.get('F'), 212, "Test 31");
	check(t2.get('f'), 212, "Test 32");
	check(t2.get('C'), 100, "Test 33");
	check(t2.get('c'), 100, "Test 34");
	check(t2.get('R'), 671.67, "Test 35");
	check(t2.get('r'), 671.67, "Test 36");     
	
	t2.set(100, 'C');
	check(t2.get(), 373.15, "Test 37");
	check(t2.get('K'), 373.15, "Test 38");
	check(t2.get('k'), 373.15, "Test 39");
	check(t2.get('F'), 212, "Test 40");
	check(t2.get('f'), 212, "Test 41");
	check(t2.get('C'), 100, "Test 42");
	check(t2.get('c'), 100, "Test 43");
	check(t2.get('R'), 671.67, "Test 44");
	check(t2.get('r'), 671.67, "Test 45");     

	
	t2.set(100, 'c');
	check(t2.get(), 373.15, "Test 46");
	check(t2.get('K'), 373.15, "Test 47");
	check(t2.get('k'), 373.15, "Test 48");
	check(t2.get('F'), 212, "Test 49");
	check(t2.get('f'), 212, "Test 50");
	check(t2.get('C'), 100, "Test 51");
	check(t2.get('c'), 100, "Test 52");
	check(t2.get('R'), 671.67, "Test 53");
	check(t2.get('r'), 671.67, "Test 54");          
	
	
	t2.set(373.15, 'K');
	check(t2.get(), 373.15, "Test 55");
	check(t2.get('K'), 373.15, "Test 56");
	check(t2.get('k'), 373.15, "Test 57");
	check(t2.get('F'), 212, "Test 58");
	check(t2.get('f'), 212, "Test 59");
	check(t2.get('C'), 100, "Test 60");
	check(t2.get('c'), 100, "Test 61");
	check(t2.get('R'), 671.67, "Test 62");
	check(t2.get('r'), 671.67, "Test 63");     

	
	t2.set(373.15, 'k');
	check(t2.get(), 373.15, "Test 64");
	check(t2.get('K'), 373.15, "Test 65");
	check(t2.get('k'), 373.15, "Test 66");
	check(t2.get('F'), 212, "Test 67");
	check(t2.get('f'), 212, "Test 68");
	check(t2.get('C'), 100, "Test 69");
	check(t2.get('c'), 100, "Test 70");
	check(t2.get('R'), 671.67, "Test 71");
	check(t2.get('r'), 671.67, "Test 72");         

	
	t2.set(671.67, 'R');
	check(t2.get(), 373.15, "Test 73");
	check(t2.get('K'), 373.15, "Test 74");
	check(t2.get('k'), 373.15, "Test 75");
	check(t2.get('F'), 212, "Test 76");
	check(t2.get('f'), 212, "Test 77");
	check(t2.get('C'), 100, "Test 78");
	check(t2.get('c'), 100, "Test 79");
	check(t2.get('R'), 671.67, "Test 80");
	check(t2.get('r'), 671.67, "Test 81");     

	
	t2.set(671.67, 'r');
	check(t2.get(), 373.15, "Test 82");
	check(t2.get('K'), 373.15, "Test 83");
	check(t2.get('k'), 373.15, "Test 84");
	check(t2.get('F'), 212, "Test 85");
	check(t2.get('f'), 212, "Test 86");
	check(t2.get('C'), 100, "Test 87");
	check(t2.get('c'), 100, "Test 88");
	check(t2.get('R'), 671.67, "Test 89");
	check(t2.get('r'), 671.67, "Test 90");      
	
	
	// t3 and t2 are different
	Temperature t3(1);
	Temperature t4(2);
	
	// <
	check(t3.isLessThan(t4), true, "Test 91");
	check(t4.isLessThan(t3), false, "Test 92");
	
	// <=
	check(t3.isLessThanOrEqual(t4), true, "Test 93");
	check(t4.isLessThanOrEqual(t3), false, "Test 94");
	
	// ==
	check(t3.isEqual(t4), false, "Test 95");
	check(t4.isEqual(t3), false, "Test 96");
	
	// >=
	check(t3.isGreaterThanOrEqual(t4), false, "Test 97");
	check(t4.isGreaterThanOrEqual(t3), true, "Test 98");

	// >
	check(t3.isGreaterThan(t4), false, "Test 99");
	check(t4.isGreaterThan(t3), true, "Test 100");

	// !=
	check(t3.isNotEqualTo(t4), true, "Test 101");
	check(t4.isNotEqualTo(t3), true, "Test 102");
	
	
	// t3 and t4 are equal, but not exactly
	t3.set(671.67, 'r');
	t4.set(212, 'f');

	// <
	check(t3.isLessThan(t4), false, "Test 103");
	check(t4.isLessThan(t3), false, "Test 104");
	
	// <=
	check(t3.isLessThanOrEqual(t4), true, "Test 105");
	check(t4.isLessThanOrEqual(t3), true, "Test 106");
	
	// ==
	check(t3.isEqual(t4), true, "Test 107");
	check(t4.isEqual(t3), true, "Test 108");
	
	// >=
	check(t3.isGreaterThanOrEqual(t4), true, "Test 109");
	check(t4.isGreaterThanOrEqual(t3), true, "Test 110");

	// >
	check(t3.isGreaterThan(t4), false, "Test 111");
	check(t4.isGreaterThan(t3), false, "Test 112?");

	// !=
	check(t3.isNotEqualTo(t4), false, "Test 113");
	check(t4.isNotEqualTo(t3), false, "Test 114");        
	
	
	// Print summary
	if(errorCount == 0){
		cout << endl << "No Errors Found" << endl;
	} else {
		cout << endl << errorCount << " test(s) failed" << endl;
	}
}

void check(bool value, bool expected, string message){
	if(value != expected){
		errorCount++;
		cout << message << ": got " << value 
			<< " expected " << expected << endl;
	}
}
	
void check(double value, double expected, string message ){
	if (!approxEqual(value, expected)){
		errorCount++;
		cout << message << ": got " << value 
			<< " expected " << expected << endl;
	}
	
}
	
bool approxEqual(double x, double y){
	return abs(x - y) < 10E-12;
}

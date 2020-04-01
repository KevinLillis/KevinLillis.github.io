// File: LargestTemplate.h
#ifndef LARGESTTEMPLATE_H
#define LARGESTTEMPLATE_H

template < class T >

T largest(T value1, T value2, T value3) {
	T largestValue = value1;
	
	if(value2 > largestValue){
		largestValue = value2;
	}
	
	if(value3 > largestValue){
		largestValue = value3;
	}
	
	return largestValue;
}


#endif
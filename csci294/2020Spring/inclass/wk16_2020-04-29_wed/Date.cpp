// File: Date.cpp
# include <sstream>
# include "Date.h"
using namespace std;

Date::Date(int m, int d, int y){
    month = m;
    day = d;
    year = y;
}

int Date::getMonth(){
    return month;
}

int Date::getDay(){
    return day;
}

int Date::getYear(){
    return year;
}

string Date::str(){
    stringstream s;
    s.str("");
    s << month << "/" << day << "/" << year;
    return s.str();
}
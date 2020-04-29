// File: Rectangle.cpp
# include "Rectangle.h"

// Overloaded Input/Output Stream Extraction/Insertion cout << r1
ostream & operator<<( ostream & output, const Rectangle & rec){
    output <<  rec.getHeight() << " " << rec.getWidth();
    return output; // elables cout << a << b << c; 
}

istream & operator>>( istream & input, Rectangle & rec) {
    double h, w;
    input >> h;
    input  >> w;
    rec.setHeight(h);
    rec.setWidth(w);
    return input; // allows cing >> a >> b >> c
}


// Constructors
Rectangle::Rectangle(double  h, double w){
    setHeight(h);
    setWidth(w);
}

// copy constructor
Rectangle::Rectangle(const Rectangle & otherRectangle){
    //:height{otherRectangle.height},width{otherRectangle.width} {
    height = otherRectangle.height;
    width = otherRectangle.width;
}


// Mutators
void Rectangle::setHeight(double h){
    height = h;
}

void Rectangle::setWidth(double w){
    width = w;
}

// Accessors
double Rectangle::getHeight() const {
    return height;
}

double Rectangle::getWidth() const {
    return width;
}

double Rectangle::area() const{
    return height * width;
}


// Overloaded Operators
// Relational Operators thisRec < otherRec
bool Rectangle::operator<(const Rectangle & right) const {
    // x < y
    return (*this).area() < right.area();
}

bool Rectangle::operator<=(const Rectangle & right) const {
    // x <= y is the same as 
    // (x < y) || (!(x < y) && !(y < x))
    // So this <= right is the same as
    return (*this) < right || (!((*this) < right) && !(right < (*this)));
}

bool Rectangle::operator==(const Rectangle & right) const {
    // x == y is the same as 
    // !(x < y) && !(y < x)
    // So this == right is the same as
    return !((*this) < right) && !(right < (*this));
}

bool Rectangle::operator>=(const Rectangle & right) const {
    // x >= y is the same as 
    // (y < x) || (!(x < y) && !(y < x))
    // So this >= right is the same as
    return (right < (*this)) 
        || (!((*this) < right) && !(right < (*this)));
}

bool Rectangle::operator>(const Rectangle & right) const {
    // x > y is the same as 
    // y < x
    // So this > right is the same as
    return right < (*this);
}

bool Rectangle::operator!=(const Rectangle & right) const {
    // x != y is the same as 
    // y < x || x < y
    // So this != right is the same as
    return right < (*this) || (*this) < right;
}


// Assignment Operator
const Rectangle & Rectangle::operator=(const Rectangle & right) {
    if( & right != this) { // avoid self-assignment
        (*this).setHeight(right.getHeight());
        (*this).setWidth(right.getWidth());
    } // end if

    return *this;
}


// Compound Assignment Operators
const Rectangle & Rectangle::operator+=(const Rectangle & right){
    double tempHeight = (*this).getHeight() + right.getHeight();
    double tempWidth = (*this).getWidth() + right.getWidth();
    (*this).setHeight(tempHeight);
    (*this).setWidth(tempWidth);

    return *this;
}

const Rectangle & Rectangle::operator-=(const Rectangle & right){
    double tempHeight = (*this).getHeight() - right.getHeight();
    double tempWidth = (*this).getWidth() - right.getWidth();
    (*this).setHeight(tempHeight);
    (*this).setWidth(tempWidth);

    return *this;
}

const Rectangle & Rectangle::operator*=(const Rectangle & right){
    double tempHeight = (*this).getHeight() * right.getHeight();
    double tempWidth = (*this).getWidth() * right.getWidth();
    (*this).setHeight(tempHeight);
    (*this).setWidth(tempWidth);

    return *this;
}

const Rectangle & Rectangle::operator/=(const Rectangle & right){
    double tempHeight = (*this).getHeight() / right.getHeight();
    double tempWidth = (*this).getWidth() / right.getWidth();
    (*this).setHeight(tempHeight);
    (*this).setWidth(tempWidth);

    return *this;
}


// Binary Arithmetic Operators r1 = r2 + r3
Rectangle Rectangle::operator+(const Rectangle & right) const{
    Rectangle temp = *this; // uses overloaded assignment operator
    temp += right; // uses overloaded += operator
    return temp;
}

Rectangle Rectangle::operator-(const Rectangle & right) const{
    Rectangle temp = *this; // uses overloaded assignment operator
    temp -= right; // uses overloaded -= operator
    return temp;
}

Rectangle Rectangle::operator*(const Rectangle & right) const{
    Rectangle temp = *this; // uses overloaded assignment operator
    temp *= right; // uses overloaded *= operator
    return temp;
}

Rectangle Rectangle::operator/(const Rectangle & right) const{
    Rectangle temp = *this; // uses overloaded assignment operator
    temp /= right; // uses overloaded /= operator
    return temp;
}


// Unary pre-increment and pre-decrement Operators  y = x++  ++x
Rectangle Rectangle::operator++(){
    // pre-increment ++r
    double tempHeight = (*this).getHeight() + 1;
    double tempWidth = (*this).getWidth() + 1;
    (*this).setHeight(tempHeight);
    (*this).setWidth(tempWidth);
    Rectangle temp = *this; // uses overloaded assignment operator
    return temp;
}

Rectangle Rectangle::operator--(){
    // pre-decrement --r
    double tempHeight = (*this).getHeight() - 1;
    double tempWidth = (*this).getWidth() - 1;
    (*this).setHeight(tempHeight);
    (*this).setWidth(tempWidth);
    Rectangle temp = *this; // uses overloaded assignment operator
    return temp;
}

Rectangle Rectangle::operator++(int dummy){
    // post-increment r++
    Rectangle temp = *this; // uses overloaded assignment operator
    double tempHeight = (*this).getHeight() + 1;
    double tempWidth = (*this).getWidth() + 1;
    (*this).setHeight(tempHeight);
    (*this).setWidth(tempWidth);

    return temp;
}

Rectangle Rectangle::operator--(int dummy){
    // post-decrement r--
    Rectangle temp = *this; // uses overloaded assignment operator
    double tempHeight = (*this).getHeight() - 1;
    double tempWidth = (*this).getWidth() - 1;
    (*this).setHeight(tempHeight);
    (*this).setWidth(tempWidth);

    return temp;
}

// Unary Plus and Minus
Rectangle Rectangle::operator-() const {
    double tempHeight = (*this).getHeight() * -1;
    double tempWidth = (*this).getWidth() * -1;
    Rectangle temp(tempHeight, tempWidth);
    return temp;
}

Rectangle Rectangle::operator+() const {
    Rectangle temp = (*this);
    return temp;
}
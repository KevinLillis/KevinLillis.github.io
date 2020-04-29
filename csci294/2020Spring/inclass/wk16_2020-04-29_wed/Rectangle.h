// File: Rectangle.h
# ifndef RECTANGLE_H
# define RECTANGLE_H

# include <iostream>
using namespace std;

class Rectangle{
    // Overloaded Input/Output Stream Extraction/Insertion 
    friend ostream & operator<<( ostream &, const Rectangle &);
    friend istream & operator>>( istream &, Rectangle &);


private:
    double height{};
    double width{};
    
public:
    // Constructors
    Rectangle(double h = 1, double w = 1);
    Rectangle(const Rectangle &);

    // Mutators
    void setHeight(double);
    void setWidth(double);

    // Accessors
    double getHeight() const;
    double getWidth() const;
    double area() const;

    /* --- Overloaded Operators --- */
    // Relational Operators
    bool operator<(const Rectangle &) const;
    bool operator<=(const Rectangle &) const;
    bool operator==(const Rectangle &) const;
    bool operator>=(const Rectangle &) const;
    bool operator>(const Rectangle &) const;
    bool operator!=(const Rectangle &) const;

    // Assignment Operator
    const Rectangle & operator=(const Rectangle &);

    // Compound Assignment Operators
    const Rectangle & operator+=(const Rectangle &);
    const Rectangle & operator-=(const Rectangle &);
    const Rectangle & operator*=(const Rectangle &);
    const Rectangle & operator/=(const Rectangle &);

    // Binary Arithmetic Operators
    Rectangle operator+(const Rectangle &) const;
    Rectangle operator-(const Rectangle &) const;
    Rectangle operator*(const Rectangle &) const;
    Rectangle operator/(const Rectangle &) const;

    // Unary pre-increment and pre-decrement Operators
    Rectangle operator++(); // Pre-increment, ++r
    Rectangle operator--(); // Pre-decrement, --r

    // Unary post-increment and post-decrement Operators
    Rectangle operator++(int); // Post-increment, r++
    Rectangle operator--(int); // Post-decrement, r--

    // Unary Plus and Minus
    Rectangle operator-() const;
    Rectangle operator+() const;

};
# endif
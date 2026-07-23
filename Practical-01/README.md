# Practical No. 01

## Experiment

1. GCD and LCM using Euclidean Algorithm
2. Modular Arithmetic Operations

---

# 1(a) GCD and LCM using Euclidean Algorithm

## Aim

To find the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two integers using the Euclidean Algorithm.

## Theory

The Euclidean Algorithm finds the GCD by repeatedly dividing the larger number by the smaller number until the remainder becomes zero.

Formula:

LCM = (First Number × Second Number) / GCD

## Algorithm

1. Read two numbers.
2. Find GCD using the Euclidean Algorithm.
3. Calculate LCM using the formula.
4. Display the result.

## Time Complexity

O(log(min(a,b)))

## Space Complexity

O(1)

## How to Compile

```bash
javac EuclideanGCDLCM.java
```

## How to Run

```bash
java EuclideanGCDLCM
```

## Sample Output

```text
Enter First Number : 36
Enter Second Number : 60

GCD = 12
LCM = 180
```

---

# 1(b) Modular Arithmetic

## Aim

To perform modular addition, subtraction, multiplication and division.

## Theory

Modular arithmetic performs calculations with respect to a modulus.

Addition

(A + B) mod M

Subtraction

(A - B) mod M

Multiplication

(A × B) mod M

Division

(A × B⁻¹) mod M

where B⁻¹ is the modular inverse.

## Algorithm

1. Read two numbers and modulus.
2. Perform modular addition.
3. Perform modular subtraction.
4. Perform modular multiplication.
5. Find modular inverse.
6. Perform modular division.

## Time Complexity

O(M)

## Space Complexity

O(1)

## How to Compile

```bash
javac ModularArithmetic.java
```

## How to Run

```bash
java ModularArithmetic
```

## Sample Output

```text
Enter First Number : 8
Enter Second Number : 3
Enter Modulus : 5

Modular Addition = 1
Modular Subtraction = 0
Modular Multiplication = 4
Modular Division = 1
```

---

## Conclusion

The Euclidean Algorithm efficiently computes the GCD and LCM, while modular arithmetic forms the foundation of modern cryptographic algorithms such as RSA, Diffie-Hellman, and Digital Signatures.

# Practical No. 02

# Substitution Techniques

This practical demonstrates classical substitution cipher techniques.

Experiments included:

- 2(a) Caesar Cipher
- 2(b) Playfair Cipher

---

# 2(a) Caesar Cipher

## Aim

To implement Caesar Cipher encryption and decryption using Java.

---

## Theory

Caesar Cipher is one of the oldest substitution ciphers. Each alphabet in the plaintext is shifted by a fixed number of positions known as the key.

Example (Key = 3)

A → D

B → E

C → F

---

## Algorithm

1. Read the plaintext.
2. Choose a key.
3. Shift each alphabet by the key value.
4. Display encrypted text.
5. Reverse the shift for decryption.

---

## Time Complexity

O(n)

---

## Space Complexity

O(n)

---

## How to Compile

```bash
javac CaesarCipher.java
```

## How to Run

```bash
java CaesarCipher
```

---

## Sample Output

```text
Original Text  : Mahesh Pawar 1229
Encrypted Text : Pdkhvk Sdzdu 1229
Decrypted Text : Mahesh Pawar 1229
```

---

# 2(b) Playfair Cipher

## Aim

To generate a Playfair Cipher matrix using a secret key.

---

## Theory

Playfair Cipher is a digraph substitution cipher that encrypts pairs of letters instead of individual letters. It uses a 5×5 matrix generated from a secret key, with I and J treated as the same character.

---

## Algorithm

1. Read the secret key.
2. Remove duplicate letters.
3. Replace J with I.
4. Fill the 5×5 matrix with the key.
5. Fill remaining positions with unused alphabets.
6. Display the matrix.

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## How to Compile

```bash
javac PlayfairCipher.java
```

## How to Run

```bash
java PlayfairCipher
```

---

## Sample Output

```text
Enter Key : SECURITY

Playfair Matrix:

S E C U R
I T Y A B
D F G H K
L M N O P
Q V W X Z
```

---

# Conclusion

This practical demonstrates two classical substitution techniques:

- Caesar Cipher, which substitutes each letter with another based on a fixed shift.
- Playfair Cipher, which encrypts pairs of letters using a 5×5 key matrix.

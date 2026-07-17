# Practical No. 01

# Caesar Cipher Encryption and Decryption using Java

---

## Aim

To implement Caesar Cipher Encryption and Decryption using Java.

---

# Theory

The Caesar Cipher is one of the oldest and simplest encryption techniques.

It is a substitution cipher in which every alphabet in the plaintext is shifted by a fixed number called the **Key** or **Shift Value**.

Only alphabets are shifted.

Numbers, spaces and special characters remain unchanged.

Example

Plain Text

HELLO

Shift = 3

Cipher Text

KHOOR

The same key is used to decrypt the encrypted message.

---

# Encryption Formula

E(x) = (x + k) mod 26

where

x = Plain Text

k = Shift Key

---

# Decryption Formula

D(x) = (x − k) mod 26

---

# Algorithm

1. Read the input string.
2. Read the shift value.
3. Traverse every character.
4. If uppercase, shift from 'A'.
5. If lowercase, shift from 'a'.
6. Ignore spaces and numbers.
7. Print encrypted text.
8. Decrypt using the same key.

---

# Time Complexity

O(N)

where N is the length of the string.

---

# Space Complexity

O(N)

---

# Advantages

- Easy to understand.
- Very easy to implement.
- Fast execution.
- Good for learning Cryptography.

---

# Disadvantages

- Easy to crack.
- Only 26 possible keys.
- Not secure for modern communication.

---

# Applications

- Educational purpose.
- Basic Cryptography learning.
- Secret messages.
- Historical encryption.

---

# Conclusion

The Caesar Cipher is one of the simplest substitution ciphers. It encrypts text by shifting every alphabet using a fixed key. Although it is not secure for modern applications, it helps in understanding the fundamentals of cryptography and encryption.

---

# Sample Output

Original Text  : Mahesh Pawar 1229

Encrypted Text : Pdkhvk Sdzdu 1229

Decrypted Text : Mahesh Pawar 1229

------------------------------------------------------------

# How to Run the Program

### Step 1 : Open Terminal / Command Prompt / PowerShell

Navigate to the practical folder.

```bash
cd Practical-01-Caesar-Cipher
```

---

### Step 2 : Compile the Java Program

```bash
javac CaeserCipher.java
```

This generates:

```
CaeserCipher.class
```

---

### Step 3 : Run the Program

```bash
java CaeserCipher
```

---

# Sample Output

```text
Original Text  : Mahesh Pawar 1229
Encrypted Text : Pdkhvk Sdzdu 1229
Decrypted Text : Mahesh Pawar 1229
```

------------------------------------------------------------
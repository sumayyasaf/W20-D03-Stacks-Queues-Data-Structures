**Lab: Stack-Based Problems in Java**

## **Objective**
The goal of this lab is to practice using stacks to solve common algorithmic problems. You will implement two functions: one to check for valid parentheses in a string and another to evaluate an arithmetic expression in Reverse Polish Notation.

---

## **Problem 1: Valid Parentheses**

### **Problem Statement**
Given a string `s` containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

A string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every closing bracket has a corresponding open bracket of the same type.

### **Example Inputs & Outputs**
```java
Input: "()"
Output: true

Input: "()[]{}"
Output: true

Input: "(]"
Output: false

Input: "([])"
Output: true
```

### **Instructions**
1. Implement the method `isValidParentheses(String s)`.
2. Use a **Stack** to keep track of open brackets.
3. If you encounter a closing bracket, check if it matches the top of the stack.
4. If all conditions are met, return `true`; otherwise, return `false`.

#### **Method Signature**
```java
public static boolean isValidParentheses(String s);
```

---

## **Problem 2: Evaluate Reverse Polish Notation**

### **Problem Statement**
You are given an array of strings `tokens` representing an arithmetic expression in **Reverse Polish Notation (RPN)**.

Evaluate the expression and return an integer that represents the value of the expression.

### **Constraints**
- Valid operators are `+`, `-`, `*`, and `/`.
- Each operand may be an integer or another expression.
- The division between two integers always truncates toward zero.
- No division by zero will occur.
- The input represents a valid arithmetic expression.

### **Example Inputs & Outputs**
```java
Input: ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

Input: ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6

Input: ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
```

### **Instructions**
1. Implement the method `evaluateRPN(String[] tokens)`.
2. Use a **Stack** to store operands.
3. Iterate through `tokens`, pushing numbers onto the stack.
4. When encountering an operator, pop two numbers, apply the operator, and push the result back.
5. Return the final result from the stack.

#### **Method Signature**
```java
public static int evaluateRPN(String[] tokens);
```

---

## **Testing Your Code**
- Run your implementations with the provided examples.
- Compare your results with those from [LeetCode Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) and [LeetCode Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/).
- Add additional test cases to ensure robustness.

### **Bonus Challenge**
- Extend `isValidParentheses` to handle cases with invalid characters.
- Extend `evaluateRPN` to support floating-point numbers.

---

## **Submission**
Submit your `.java` file containing the implementations for `isValidParentheses` and `evaluateRPN` along with test cases demonstrating correctness.


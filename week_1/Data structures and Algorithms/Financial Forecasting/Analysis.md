# Analysis

## Time Complexity

Each recursive call handles one year.  
Number of recursive calls = n  

Therefore:

- **Time Complexity = O(n)**
- **Space Complexity = O(n)** (due to recursion stack)

---

## How to Optimize?

### 1. Use Direct Formula

```java
double futureValue =
        presentValue *
        Math.pow(1 + growthRate, years);
```

**Complexity:**
- Time Complexity = O(1)
- Space Complexity = O(1)

### 2. Memoization (for repeated calculations)

```java
HashMap<Integer, Double> memo = new HashMap<>();
```

Store previously computed results and reuse them.

**Benefits:**
Avoids redundant calculations.
Improves performance for large forecasting proble
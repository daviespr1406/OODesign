# OODesign
# 📊 Mean and Standard Deviation Calculator

## 👤 Author
**David Espinosa**

---

## 📌 Description
This project is an implementation of a program that calculates the **mean** and the **standard deviation** of a dataset.

It was developed in **Java** using **Maven** and a **custom implementation of a linked list** (compliant with the Java Collections API style).

---

## 🚀 Requirements
- Java 17+
- Maven 3.8+
- GitHub for version control

---

## ⚙️ Implementation Details

### Custom Linked List
- Implements `add`, `get`, `size`, and `iterator`.
- Uses **generics** to store any data type.
- Implements `Iterable<E>` to support enhanced for-loops.

### Statistics
- **Mean**:  
  \[
  \bar{x} = \frac{1}{n} \sum_{i=1}^{n} x_i
  \]
- **Standard Deviation (s)**:  
  \[
  s = \sqrt{\frac{1}{n-1} \sum_{i=1}^{n} (x_i - \bar{x})^2}
  \]

---

## 🧪 Testing

We used the values in **Table 1** of the assignment:

| Column 1 (Estimate Proxy Size) | Column 2 (Development Hours) |
|--------------------------------|-------------------------------|
| 160 | 15.0 |
| 591 | 69.9 |
| 114 | 6.5 |
| 229 | 22.4 |
| 230 | 28.4 |
| 270 | 65.9 |
| 128 | 19.4 |
| 1657 | 198.7 |
| 624 | 38.8 |
| 1503 | 138.2 |

Expected results (Table 2):
- **Column 1** → Mean = **550.6**, StdDev = **572.03**
- **Column 2** → Mean = **60.32**, StdDev = **62.26**

JUnit tests (`StatisticsTest`) confirm these results.

---

## ▶️ Run the Program

1. Package
```bash
   mvn package
```

2. Run with input file

Create a file input.txt with one number per line, for example:

160
591
114
229
230
270
128
1657
624
1503


Then run:

```bash
java -cp target/meanstddev-1.0-SNAPSHOT.jar com.example.meanstddev.App input.txt
```

Expected output:

Mean: 550.60
Standard Deviation: 572.03


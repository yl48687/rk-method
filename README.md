# RK Method
This Java program calculates the values of `k1`, `k2`, `k3`, and `k4` to approximate `y` with the RK-method of order 4 using a step size of `h = 0.4`.

## Design Overview
The program consists of a single class `RKMethod` implementing the RK-method of order 4.

## Functionality
`RKMethod.java`:
- Contains the main logic for calculating the RK-method.
- Defines two methods: `f(double t, double y)` and `rk4(double t, double y, double h)`.
- Uses `Math.sqrt()` and basic arithmetic operations to calculate the derivative and approximate `y`.

## File Structure and Content

```
rk-method/
├── README.md
└── RKMethod.java
```
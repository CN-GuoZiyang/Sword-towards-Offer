//
//    快速幂原理
//TODO
public class PowerOfaValue {

    public double Power(double base, int exponent) {
        int n = Math.abs(exponent);
        double result = 0.0;
        if (n == 0)
            return 1.0;
        if (n == 1)
            return base;

        result = Power(base, n >> 1);
        result *= result;
        if ((n & 1) == 1) // 如果指数n为奇数，则要再乘一次底数base
            result *= base;
        if (exponent < 0) // 如果指数为负数，则应该求result的倒数
            result = 1 / result;

        return result;
    }

}

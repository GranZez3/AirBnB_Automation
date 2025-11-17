package lambda_demo;

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}
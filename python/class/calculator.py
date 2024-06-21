import math


class Calculator:

    def __init__(self, initial_value=0):
        self.result = initial_value

    def add(self, num):
        self.result += num
        return self.result

    def sub(self, num):
        self.result -= num
        return self.result

    def mul(self, num):
        self.result *= num
        return self.result

    def div(self, num):
        if num != 0:
            self.result /= num
        else:
            return "Error: Division by zero"
        return self.result

    def sqrt(self):
        if self.result >= 0:
            self.result = math.sqrt(self.result)
        else:
            return "Error: Cannot take the square root of a negative number"
        return self.result

    def select(self, operation, num=None):
        if operation == 'add':
            return self.add(num)
        elif operation == 'sub':
            return self.sub(num)
        elif operation == 'mul':
            return self.mul(num)
        elif operation == 'div':
            return self.div(num)
        elif operation == 'sqrt':
            return self.sqrt()
        else:
            return "Error: Unsupported operation"


# Create calculator instance with initial value
def initialize_calculator():
    while True:
        try:
            initial_value = float(input("Enter initial number: "))
            return Calculator(initial_value)
        except ValueError:
            print("Invalid number, please try again.")


calc = initialize_calculator()


# Function to handle user input and perform operations
def perform_operations(calculator):
    while True:
        operation = input(
            "Enter operation (add, sub, mul, div, sqrt) or 'exit' to stop: "
        ).strip()
        if operation == 'exit':
            break
        if operation in ['add', 'sub', 'mul', 'div']:
            try:
                num = float(input("Enter number: "))
            except ValueError:
                print("Invalid number, please try again.")
                continue
            result = calculator.select(operation, num)
        elif operation == 'sqrt':
            result = calculator.select(operation)
        else:
            print("Error: Unsupported operation")
            continue
        print(f"Result: {result}")


# Using the calculator
perform_operations(calc)

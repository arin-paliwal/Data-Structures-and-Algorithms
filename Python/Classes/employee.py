class Employee:
    def __init__(self, name, age, job_title, salary):
        self.name = name
        self.age = age
        self.job_title = job_title
        self.salary = salary

    def print_employee_details(self):
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")
        print(f"Job Title: {self.job_title}")
        print(f"Salary: {self.salary}")


# Create an instance of the Employee class
employee1 = Employee("John Doe", 30, "Software Engineer", 100000)

# Call the print_employee_details method to print the employee details
employee1.print_employee_details()

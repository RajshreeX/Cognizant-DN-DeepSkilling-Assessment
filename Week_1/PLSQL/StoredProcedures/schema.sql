CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    AccountType VARCHAR2(20),
    Balance NUMBER(10,2)
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER(10,2)
);

INSERT INTO Accounts VALUES (101,'John','Savings',10000);
INSERT INTO Accounts VALUES (102,'Alice','Savings',15000);
INSERT INTO Accounts VALUES (103,'David','Current',20000);

INSERT INTO Employees VALUES (1,'Riya','IT',50000);
INSERT INTO Employees VALUES (2,'Rahul','HR',45000);
INSERT INTO Employees VALUES (3,'Aman','IT',60000);

COMMIT;
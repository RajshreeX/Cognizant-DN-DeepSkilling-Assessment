CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(

    p_department IN VARCHAR2,
    p_bonusPercent IN NUMBER

)

AS
BEGIN

    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonusPercent / 100)
    WHERE Department = p_department;

    COMMIT;

END;
/
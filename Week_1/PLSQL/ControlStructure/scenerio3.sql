SET SERVEROUTPUT ON;

BEGIN

    FOR loan_rec IN

    (

        SELECT c.Name,

               l.LoanID,

               l.DueDate

        FROM Customers c

        JOIN Loans l

        ON c.CustomerID=l.CustomerID

        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE+30

    )

    LOOP

        DBMS_OUTPUT.PUT_LINE(

        'Reminder: Loan '

        ||loan_rec.LoanID||

        ' for '

        ||loan_rec.Name||

        ' is due on '

        ||loan_rec.DueDate

        );

    END LOOP;

END;
/
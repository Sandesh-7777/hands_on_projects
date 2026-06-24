--Apply 1% Interest Rate Discount for Customers Above 60

DECLARE
    CURSOR cust_cursor IS
        SELECT c.CustomerID,
               l.LoanID,
               l.InterestRate,
               FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) AS Age
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID;

BEGIN
    FOR rec IN cust_cursor LOOP

        IF rec.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied for Customer ID: '
                || rec.CustomerID
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/
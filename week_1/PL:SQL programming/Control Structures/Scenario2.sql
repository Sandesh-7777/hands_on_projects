--First create the column

ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);

--Set VIP Flag for Customers with Balance > 10000
BEGIN

    FOR rec IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP

        IF rec.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

END;
/

select * from Customers; --Check the IsVIP column values
SELECT CI.NAME
FROM CITY AS CI INNER JOIN COUNTRY AS CO
ON CI.COUNTRYCODE = CO.CODE AND CO.CONTINENT = 'Africa';
-- WHERE CO.CONTINENT = 'Africa';



--Select Name From City Where CountryCode In (
--    Select Code From Country Where Continent = 'Africa');

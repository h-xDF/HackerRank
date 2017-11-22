SELECT SUM(population) FROM CITY
GROUP BY countrycode
HAVING countrycode = 'JPN';

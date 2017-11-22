SELECT salary * months AS max_earner, COUNT(*) FROM Employee
GROUP BY max_earner
ORDER BY max_earner DESC
LIMIT 1;

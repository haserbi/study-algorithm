SELECT
  ai.ANIMAL_TYPE,
  COUNT(*) AS count
FROM ANIMAL_INS AS ai
WHERE 1 = 1
GROUP BY ai.ANIMAL_TYPE
ORDER BY ai.ANIMAL_TYPE ASC
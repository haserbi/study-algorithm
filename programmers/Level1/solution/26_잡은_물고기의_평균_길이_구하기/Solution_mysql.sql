-- https://school.programmers.co.kr/learn/courses/30/lessons/293259

SELECT
  ROUND
  (
    AVG(IFNULL(fi.LENGTH, 10)),
    2
  ) AS AVERAGE_LENGTH
FROM FISH_INFO AS fi

ÖDEV - 1

1 - SELECT title,description FROM film 
2 - SELECT * FROM film WHERE length>60 And length<75
3 - SELECT * FROM film WHERE rental_rate=0.99 and (replacement_cost=12.99 OR replacement_cost=28.99)
4 - SELECT last_name FROM customer where first_name='Mary'
5 - SELECT * FROM film WHERE length<=50 And not(rental_rate=2.99 or rental_rate=4.99)

ÖDEV - 2

1 - SELECT * FROM film WHERE replacement_cost between 12.99 And 16.99
2 - SELECT * FROM actor where first_name IN ('Penelope', 'Nick', 'Ed')
3 - SELECT * FROM film WHERE rental_rate IN (0.99, 2.99, 4.99) And replacement_cost IN (12.99, 15.99, 28.99)

ÖDEV - 3

1 - SELECT * FROM country WHERE country LIKE 'A%a'
2 - SELECT * FROM country WHERE country LIKE '_____%n'
3 - SELECT * FROM film WHERE title ILIKE '%t%' AND (LENGTH(title)-LENGTH(Replace(REPLACE(title,'T',''),'t','')))>=4
4 - SELECT * FROM film WHERE length>90 And title Like 'C%' AND rental_rate=2.99

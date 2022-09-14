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
3 - SELECT * FROM film WHERE title ILIKE '%t%t&t&t%'
4 - SELECT * FROM film WHERE length>90 And title Like 'C%' AND rental_rate=2.99

ÖDEV - 4

1 - SELECT DISTINCT replacement_cost FROM film
2 - SELECT COUNT(DISTINCT replacement_cost) FROM film
3 - SELECT COUNT(*) FROM film WHERE title LIKE 'T%' AND cast(rating as varchar) like 'G%'
4 - SELECT COUNT(*) FROM country where length(country)=5
5 - SELECT count(*) FROM city where city ilike '%r'

ÖDEV - 5

1 - SELECT * FROM film where title like '%n' order by length desc limit 5
2 - SELECT * FROM film where title like '%n' order by length offset 5 limit 5
3 - SELECT * FROM customer  where store_id= 1 order by last_name desc limit 4

ÖDEV - 6

1 - SELECT AVG(rental_rate ) FROM film
2 - SELECT count(*) FROM film where title like 'C%'
3 - SELECT max(length) FROM film where rental_rate=0.99
4 - SELECT COUNT(DISTINCT replacement_cost) FROM film where length>150

ÖDEV - 7

1 - SELECT rating FROM film group by rating 
2 - SELECT replacement_cost, count(*) FROM film group by replacement_cost having count(*)>50 
3 - SELECT store_id , count(*) FROM customer group by store_id
4 - SELECT country_id, count(city) FROM city group by country_id ORDER BY COUNT(city) DESC LIMIT 1


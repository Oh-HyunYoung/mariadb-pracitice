-- 서브쿼리(SUBQUERY) SQL

-- 문제1.
-- 현재 평균 연봉보다 많은 월급을 받는 직원은 몇 명이나 있습니까?
select avg(salary)
   from salaries a, employees b
 where a.emp_no = b.emp_no
 and a.to_date = '9999-01-01';
 
select count(a.salary)
	from salaries a
   where a.salary > (select avg(salary)
				   from salaries a, employees b
				 where a.emp_no = b.emp_no
				 and a.to_date = '9999-01-01')
	and a.to_date = '9999-01-01'
	order by a.salary;


-- 문제2. (x)
-- 현재, 각 부서별로 최고의 급여를 받는 사원의 사번, 이름, 급여를 조회하세요. 
-- 단, 조회결과는 급여의 내림차순으로 정렬되어 나타나야 합니다.


-- 문제3. 
-- 현재, 자신의 부서 평균 급여보다 급여 많은 사원의 사번, 이름과 급여을 조회하세요
select avg(a.salary), b.dept_no
   from salaries a, dept_emp b
 where a.emp_no = b.emp_no
   and a.to_date = '9999-01-01'
   and b.to_date = '9999-01-01'
group by b.dept_no;
 
select a.emp_no, concat(a.first_name, ' ', a.last_name) as name, b.salary
	from employees a, salaries b, dept_emp c
  where a.emp_no = b.emp_no
    and b.emp_no = c.emp_no
    and b.to_date = '9999-01-01'
	and c.to_date = '9999-01-01'
    and (b.salary, c.dept_no) > (select avg(a.salary), b.dept_no
					   from salaries a, dept_emp b
					 where a.emp_no = b.emp_no
					   and a.to_date = '9999-01-01'
					   and b.to_date = '9999-01-01')
 order by c.emp_no asc;
    
-- 문제4. 
-- 현재, 사원들의 사번, 이름, 매니저 이름, 부서 이름으로 출력해 보세요.
select a.emp_no, concat(a.first_name, ' ', a.last_name) as myname, f.manager_name, b.dept_name
   from employees a, departments b, dept_manager c, titles d,
   (select concat(a.first_name, ' ', a.last_name) as manager_name, b.dept_name
	from employees a, departments b, dept_manager c, titles d
   where a.emp_no = c.emp_no
     and c.emp_no = d.emp_no
     and b.dept_no = c.dept_no
     and c.to_date = '9999-01-01'
     and d.to_date = '9999-01-01'
	 and d.title = 'Manager') f
     where a.emp_no = c.emp_no
     and c.emp_no = d.emp_no
     and b.dept_no = c.dept_no
     and c.to_date = '9999-01-01'
     and d.to_date = '9999-01-01'
order by a.emp_no asc;
    

select a.emp_no, concat(a.first_name, ' ', a.last_name) as manager_name, b.dept_name, d.title, b.dept_no
	from employees a, departments b, dept_manager c, titles d
   where a.emp_no = c.emp_no
     and b.dept_no = c.dept_no
     and c.to_date = '9999-01-01'
	 and d.title = 'Manager'
	order by b.dept_no asc;
  

-- 문제5.
-- 현재, 평균연봉이 가장 높은 부서의 사원들의 사번, 이름, 직책, 급여을 조회하고 급여 순으로 출력하세요.
select avg(a.salary), b.dept_no
  from  salaries a, departments b, dept_emp c
 where a.to_date = '9999-01-01'
   and c.to_date = '9999-01-01'
    and a.emp_no = c.emp_no
   and b.dept_no = c.dept_no
 group by b.dept_no
 order by avg(a.salary) desc
 limit 1;
 
    
select a.emp_no, concat(a.first_name, ' ', a.last_name), b.title, c.salary, d.dept_no
  from employees a, titles b, salaries c, departments d, dept_emp e,
	  (select avg(a.salary) as avg_salary, b.dept_no as bno
	  from  salaries a, departments b, dept_emp c
	 where a.to_date = '9999-01-01'
	   and c.to_date = '9999-01-01'
	   and a.emp_no = c.emp_no
	   and b.dept_no = c.dept_no
	 group by b.dept_no
	 order by avg(a.salary) desc
	 limit 1) f
  where a.emp_no = b.emp_no
	and b.emp_no = c.emp_no
    and d.dept_no = e.dept_no
    and c.emp_no = e.emp_no
    and c.to_date = '9999-01-01'
	and b.to_date = '9999-01-01'
    and f.bno = d.dept_no;


-- 문제6.
-- 평균 급여이 가장 높은 부서는?
-- 부서이름, 평균 급여
 select a.dept_name, avg(b.salary)
	from departments a, salaries b, dept_emp c
 where a.dept_no = c.dept_no
   and b.emp_no = c.emp_no
   group by a.dept_no
   order by avg(b.salary) desc
   limit 1;


-- 문제7.
-- 평균 급여이 가장 높은 직책?
-- 직책, 평균 급여
select a.title, avg(b.salary)
	from titles a, salaries b
 where a.emp_no = b.emp_no
   group by a.title
   order by avg(b.salary) desc
   limit 1;


-- 문제8. join 두 개?
-- 현재 자신의 매니저보다 높은 급여를 받고 있는 직원은?
-- 부서이름, 사원이름, 연봉, 매니저 이름, 매니저 급여 순으로 출력합니다.

select b.dept_no, a.first_name, c.salary
  from employees a, dept_manager b, salaries c
 where a.emp_no = b.emp_no
   and b.emp_no = c.emp_no
   and b.to_date = '9999-01-01'
   and c.to_date = '9999-01-01';

-- 정답
select a.dept_name, b.first_name, c.salary, f.na, f.sa
	from departments a, employees b, salaries c, dept_emp d,
    (select b.dept_no as dep_no, a.first_name as na, c.salary as sa
  from employees a, dept_manager b, salaries c
 where a.emp_no = b.emp_no
   and b.emp_no = c.emp_no
   and b.to_date = '9999-01-01'
   and c.to_date = '9999-01-01') f
   where a.dept_no = f.dep_no
     and b.emp_no = c.emp_no
     and a.dept_no = d.dept_no
     and d.emp_no = c.emp_no
     and c.to_date = '9999-01-01'
     and d.to_date = '9999-01-01'
     and f.sa < c.salary;





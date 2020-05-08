--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12rc1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: users; Type: TABLE; Schema: public; Owner: kader
--

CREATE TABLE public.users (
    user_name text NOT NULL,
    password text NOT NULL
);


ALTER TABLE public.users OWNER TO kader;

--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: kader
--

INSERT INTO public.users VALUES ('kader', 'elma123');
INSERT INTO public.users VALUES ('user', 'user123');
INSERT INTO public.users VALUES ('user2', 'user123');


--
-- PostgreSQL database dump complete
--


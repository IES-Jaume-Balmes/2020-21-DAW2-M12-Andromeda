import React, { useState, useEffect } from 'react';
import SearchBar from './SearchBar';
import CountryList from './CountryList';

const SearchPage = (props) => {
  const [input, setInput] = useState('');
  const [countryListDefault, setCountryListDefault] = useState();
  const [countryList, setCountryList] = useState();

  const fetchData = async () => {
    return await fetch('http://localhost:8080/api/canciones')
      .then(response => response.json())
      .then(data => {
         setCountryList(data) 
         setCountryListDefault(data)
       });}

  const updateInput = async (input) => {
    
     const filtered = countryListDefault.filter(country => {
      console.log(countryListDefault + ' 1');
      return country.cancion.toLowerCase().includes(input.toLowerCase()) +
      country.genero.toLowerCase().includes(input.toLowerCase()) 
     })
     setInput(input);
     setCountryList(filtered);
  }

  useEffect( () => {fetchData()},[]);
	
  return (
    <>
      <h1>Music List</h1>
      <SearchBar 
       input={input} 
       onChange={updateInput}
      />
      <CountryList countryList={countryList}/>
    </>
   );
}

export default SearchPage
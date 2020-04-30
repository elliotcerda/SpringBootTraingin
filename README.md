<h1>Springboot Training</h1>
<span>You customer has grocery store and needs a website to manage his products, you will be in charge of design and implement a rest api, and other team will create a front end app that will consume your service </span>

<h2>Requirements</h2>
<ul>
  <li>Connection to a database</li>
  <li>Create, update, delete, findByName and findById endpoints</li>
  <li>Use the correct http methods</li>
  <li>Use the correct http response codes</li>
  <li>Use JPA</li>
  <li>Validate request object based on the database table</li>
  <li>Handle exceptions</li>
</ul>

<h2>Product table</h2>

<table>
<thead>
  <tr>
    <td>Name</td>
    <td>Type</td>
    <td>Null allowed?</td>
    <td>Extra</td>
  </tr>
</thead>
<tbody>
  <tr>
    <td>Id</td>
    <td>int</td>
    <td>No</td>
    <td>Auto increment</td>
  </tr>
  <tr>
    <td>Name</td>
    <td>Varchar(50)</td>
    <td>No</td>
    <td></td>
  </tr>
  <tr>
    <td>UnitPrice</td>
    <td>Decimal</td>
    <td>No</td>
    <td></td>
  </tr>
   <tr>
    <td>UnitPrice</td>
    <td>Decimal</td>
    <td>No</td>
    <td></td>
  </tr>
   <tr>
    <td>Discount</td>
    <td>Decimal</td>
    <td>Yes</td>
    <td></td>
  </tr>
  <tr>
    <td>CreatedAt</td>
    <td>Date</td>
    <td>No</td>
    <td>Less than today</td>
  </tr>
</tbody>
</table>

Remember to apply all the concepts reviewd on the sessions.

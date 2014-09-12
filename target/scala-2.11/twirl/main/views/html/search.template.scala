
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jsonResult: List[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import com.google.gson.Gson
import org.apache.commons.lang3.StringUtils

Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
<title> Search Elastic!</title>
<head>
<link rel="stylesheet" href = "/assets/stylesheets/bootstrap.css" >
<style>
#Categories
"""),format.raw/*11.1*/("""{"""),format.raw/*11.2*/("""


"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""
"""),format.raw/*15.1*/("""</style>
</head>
<body ng-app>
<h1 class="page-header">Search Application <small>Redmart products</small></h1>
<div class="container-fluid">
<div class="row">
<div class="col-md-6">
	<h2>Full text Search</h2>
</div>
<div class="col-md-6">
	<h2 style="float:right;">Filtered Search</h2>
</div>
</div>
</div>

<br>

<div class="container-fluid">
<div class="row">
<div class="col-md-6">
<div id ="fulltextsearch">
<input type="text" class="typeahead" id="searchText" name="cars" data-provide="typeahead" >
<input type="button" class="btn btn-success" name="searchBtn" id="searchBttn" value="Search"/>
</div>
</div>
<div class="col-md-6">
<div id="filteredSearch" style="float:right;">
<input type="text" id="filteredText" />
<input type="button" id="FilterSubmit" class="btn btn-success" value="Search"/> 
</div>
</div>
</div>
</div>



</div>
<ol class="breadcrumb" id="breadcrums">
  <li><a href="#" id="home_br">Home</a></li>
</ol>
<center>

<div id="result">

</div>
</body>
<script src="/assets/javascripts/angular.min.js"></script>
<script src ="/assets/javascripts/jquery-2.0.3.js"></script>
<script src="/assets/javascripts/bootstrap3-typeahead.min.js"></script>
<script type="text/javascript">

$(document).ready(function()"""),format.raw/*66.29*/("""{"""),format.raw/*66.30*/("""
    """),format.raw/*67.5*/("""var obj;
    $("#searchBttn").click(function()"""),format.raw/*68.38*/("""{"""),format.raw/*68.39*/("""
        """),format.raw/*69.9*/("""var queryString = $("#searchText").val();
        $.getJSON("http://localhost:9200/mongoindex/_search?q=*"+queryString+"*&size=11",
            function(data)"""),format.raw/*71.27*/("""{"""),format.raw/*71.28*/("""
                 """),format.raw/*72.18*/("""var image_raw=JSON.stringify(data.hits.hits[0]._source.img.name);

                 image_raw = image_raw.replace(/['"]+/g, '');

                 image_raw =  image_raw.replace(/^\//,'');

                 var image_str = "<div class='col-xs-6 col-md-3'><a href='#' class='thumbnail'><img src=http://s3-ap-southeast-1.amazonaws.com/media.redmart.com/newmedia/460x/"+image_raw+" /></a></div>";
                 var short_desc = data.hits.hits[0]._source.shortdesc;
                 short_desc = "<div class='form-inline'>"+short_desc+"</div>";
                  var title = "<div class=''><strong>"+data.hits.hits[0]._source.title+"</strong></div>";
                 result = "<div class='col-md-4'>"+image_str+title+short_desc+"</div>";
                         $("#result").html(result);
                      for(i=0;i<data.hits.hits.length;i++)
                          """),format.raw/*85.27*/("""{"""),format.raw/*85.28*/("""
                          """),format.raw/*86.27*/("""var image_raw=JSON.stringify(data.hits.hits[i]._source.img.name);

                          image_raw = image_raw.replace(/['"]+/g, '');

                          image_raw =  image_raw.replace(/^\//,'');

                          var image_str = "<div class='col-xs-6 col-md-3'><a href='#' class='thumbnail'><img src=http://s3-ap-southeast-1.amazonaws.com/media.redmart.com/newmedia/460x/"+image_raw+" /></a></div>";
                         var short_desc = data.hits.hits[i]._source.shortdesc;
                          var title = "<div class=''><strong>"+data.hits.hits[0]._source.title+"</strong></div>";
                          var result = "<div class='col-md-4'>"+image_str+title+short_desc+"</div>";
                          $("#result").append(result);
                          """),format.raw/*97.27*/("""}"""),format.raw/*97.28*/("""
                    """),format.raw/*98.21*/("""}"""),format.raw/*98.22*/("""
                """),format.raw/*99.17*/(""");
    """),format.raw/*100.5*/("""}"""),format.raw/*100.6*/(""");    

"""),format.raw/*102.1*/("""}"""),format.raw/*102.2*/(""");
</script>
<script>
$(document).ready(function()"""),format.raw/*105.29*/("""{"""),format.raw/*105.30*/("""
	"""),format.raw/*106.2*/("""var res = [""];
	

	$(".typeahead").typeahead("""),format.raw/*109.28*/("""{"""),format.raw/*109.29*/("""
		"""),format.raw/*110.3*/("""valueKey: 'name',
		hint: true,
		highlight: true,
	      source: function(query,process)"""),format.raw/*113.39*/("""{"""),format.raw/*113.40*/("""
	    	  """),format.raw/*114.9*/("""$.ajax("""),format.raw/*114.16*/("""{"""),format.raw/*114.17*/("""
	    		  """),format.raw/*115.10*/("""url:'http://localhost:9000/getArray/'+query,
	    		  success:function(data)"""),format.raw/*116.32*/("""{"""),format.raw/*116.33*/("""	  
	    			  """),format.raw/*117.11*/("""var res = $(data).text();
	    			  var resu = res.replace(/[\])"""),format.raw/*118.39*/("""}"""),format.raw/*118.40*/("""["""),format.raw/*118.41*/("""{"""),format.raw/*118.42*/("""(]/g,'');
	    			  var fin =  resu.split(",");
	    			  process(fin);
	    	 """),format.raw/*121.8*/("""}"""),format.raw/*121.9*/("""
	    """),format.raw/*122.6*/("""}"""),format.raw/*122.7*/(""");
	    	  
	    	  
	      """),format.raw/*125.8*/("""}"""),format.raw/*125.9*/(""" 
	"""),format.raw/*126.2*/("""}"""),format.raw/*126.3*/(""");	
"""),format.raw/*127.1*/("""}"""),format.raw/*127.2*/(""");
</script>
<script>
$(document).ready(function()"""),format.raw/*130.29*/("""{"""),format.raw/*130.30*/("""
	"""),format.raw/*131.2*/("""$("#home_br").click(function()"""),format.raw/*131.32*/("""{"""),format.raw/*131.33*/("""
			
		"""),format.raw/*133.3*/("""$.ajax("""),format.raw/*133.10*/("""{"""),format.raw/*133.11*/("""
  		  """),format.raw/*134.7*/("""url:'http://localhost:9000/getCategories',
  		  success:function(data)"""),format.raw/*135.29*/("""{"""),format.raw/*135.30*/("""	 	
  			  """),format.raw/*136.8*/("""var res = $(data).text();
			  var resu = res.replace(/[\])"""),format.raw/*137.34*/("""}"""),format.raw/*137.35*/("""["""),format.raw/*137.36*/("""{"""),format.raw/*137.37*/("""(]/g,'');
			  var fin =  resu.split(",");
			  for(var i=0; i< fin.length;i++)"""),format.raw/*139.37*/("""{"""),format.raw/*139.38*/("""
				  """),format.raw/*140.7*/("""var cat =fin[i].trim();
		      var cat_div = "<div class='col-md-3 col-xs-6' id='Categories'><a href='#' onclick='getSubCategories(\""+cat.toString()+"\")' class='thumbnail'><div><h3>"+fin[i]+"</h3></div></a></div>";
  			  $("#result").append(cat_div);
			  """),format.raw/*143.6*/("""}"""),format.raw/*143.7*/("""
  	 """),format.raw/*144.5*/("""}"""),format.raw/*144.6*/("""
  			  
  			  
  """),format.raw/*147.3*/("""}"""),format.raw/*147.4*/(""");
		"""),format.raw/*148.3*/("""}"""),format.raw/*148.4*/(""");
	"""),format.raw/*149.2*/("""}"""),format.raw/*149.3*/(""");
	
</script>
<script>		
	
	function getSubCategories(category)"""),format.raw/*154.37*/("""{"""),format.raw/*154.38*/("""
		 """),format.raw/*155.4*/("""$("#result").html("");
		var Url = encodeURI('http://localhost:9000/getSubCategories/'+category);
		$.ajax("""),format.raw/*157.10*/("""{"""),format.raw/*157.11*/("""
	  		  """),format.raw/*158.8*/("""url:Url,
	  		  success:function(data)"""),format.raw/*159.30*/("""{"""),format.raw/*159.31*/("""	 	
	  			  """),format.raw/*160.9*/("""var res = $(data).text();
				  var resu = res.replace(/[\])"""),format.raw/*161.35*/("""}"""),format.raw/*161.36*/("""["""),format.raw/*161.37*/("""{"""),format.raw/*161.38*/("""(]/g,'');
				  var fin =  resu.split(",");
				  for(var i=0; i< fin.length;i++)"""),format.raw/*163.38*/("""{"""),format.raw/*163.39*/("""
					  """),format.raw/*164.8*/("""var cat =fin[i].trim();
					 
					  $("#result").append(cat);
				  """),format.raw/*167.7*/("""}"""),format.raw/*167.8*/("""
				  """),format.raw/*168.7*/("""}"""),format.raw/*168.8*/("""
		"""),format.raw/*169.3*/("""}"""),format.raw/*169.4*/(""");
		var cat_br = "<li><a href='#' id='"+category+"_br' >"+category+"</a></li>";
		$("#breadcrums").append(cat_br);
	"""),format.raw/*172.2*/("""}"""),format.raw/*172.3*/("""
"""),format.raw/*173.1*/("""</script>

</html>

"""))}
  }

  def render(jsonResult:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(jsonResult)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (jsonResult) => apply(jsonResult)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Sep 11 19:07:09 IST 2014
                  SOURCE: /Users/abhishek/Abhishek/myApp/app/views/search.scala.html
                  HASH: 2bbb62fb9299fac9179ad6f5d02bd695a5613f3c
                  MATRIX: 730->1|915->27|942->102|1119->252|1147->253|1177->256|1205->257|1233->258|2491->1488|2520->1489|2552->1494|2626->1540|2655->1541|2691->1550|2877->1708|2906->1709|2952->1727|3855->2602|3884->2603|3939->2630|4763->3426|4792->3427|4841->3448|4870->3449|4915->3466|4950->3473|4979->3474|5015->3482|5044->3483|5123->3533|5153->3534|5183->3536|5258->3582|5288->3583|5319->3586|5437->3675|5467->3676|5504->3685|5540->3692|5570->3693|5609->3703|5714->3779|5744->3780|5787->3794|5880->3858|5910->3859|5940->3860|5970->3861|6077->3940|6106->3941|6140->3947|6169->3948|6225->3976|6254->3977|6285->3980|6314->3981|6346->3985|6375->3986|6454->4036|6484->4037|6514->4039|6573->4069|6603->4070|6638->4077|6674->4084|6704->4085|6739->4092|6839->4163|6869->4164|6908->4175|6996->4234|7026->4235|7056->4236|7086->4237|7194->4316|7224->4317|7259->4324|7547->4584|7576->4585|7609->4590|7638->4591|7685->4610|7714->4611|7747->4616|7776->4617|7808->4621|7837->4622|7930->4686|7960->4687|7992->4691|8128->4798|8158->4799|8194->4807|8261->4845|8291->4846|8331->4858|8420->4918|8450->4919|8480->4920|8510->4921|8620->5002|8650->5003|8686->5011|8784->5081|8813->5082|8848->5089|8877->5090|8908->5093|8937->5094|9082->5211|9111->5212|9140->5213
                  LINES: 26->1|30->1|31->4|38->11|38->11|41->14|41->14|42->15|93->66|93->66|94->67|95->68|95->68|96->69|98->71|98->71|99->72|112->85|112->85|113->86|124->97|124->97|125->98|125->98|126->99|127->100|127->100|129->102|129->102|132->105|132->105|133->106|136->109|136->109|137->110|140->113|140->113|141->114|141->114|141->114|142->115|143->116|143->116|144->117|145->118|145->118|145->118|145->118|148->121|148->121|149->122|149->122|152->125|152->125|153->126|153->126|154->127|154->127|157->130|157->130|158->131|158->131|158->131|160->133|160->133|160->133|161->134|162->135|162->135|163->136|164->137|164->137|164->137|164->137|166->139|166->139|167->140|170->143|170->143|171->144|171->144|174->147|174->147|175->148|175->148|176->149|176->149|181->154|181->154|182->155|184->157|184->157|185->158|186->159|186->159|187->160|188->161|188->161|188->161|188->161|190->163|190->163|191->164|194->167|194->167|195->168|195->168|196->169|196->169|199->172|199->172|200->173
                  -- GENERATED --
              */
          
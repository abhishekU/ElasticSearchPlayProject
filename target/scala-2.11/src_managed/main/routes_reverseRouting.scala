// @SOURCE:/Users/abhishek/Abhishek/myApp/conf/routes
// @HASH:ea3e46cdede25e8bd7eb94e4236f25ef687c82d9
// @DATE:Wed Sep 10 11:19:33 IST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {


// @LINE:9
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
class ReverseSearch {


// @LINE:10
def getResultArray(query:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getArray/" + implicitly[PathBindable[String]].unbind("query", dynamicString(query)))
}
                        

// @LINE:12
def getSubCategories(cat:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getSubCategories/" + implicitly[PathBindable[String]].unbind("cat", dynamicString(cat)))
}
                        

// @LINE:11
def getCategories(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getCategories")
}
                        

// @LINE:7
def search(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseAssets {


// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
class ReverseSearch {


// @LINE:10
def getResultArray : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.getResultArray",
   """
      function(query) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getArray/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("query", encodeURIComponent(query))})
      }
   """
)
                        

// @LINE:12
def getSubCategories : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.getSubCategories",
   """
      function(cat) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getSubCategories/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cat", encodeURIComponent(cat))})
      }
   """
)
                        

// @LINE:11
def getCategories : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.getCategories",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getCategories"})
      }
   """
)
                        

// @LINE:7
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {


// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
class ReverseSearch {


// @LINE:10
def getResultArray(query:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.getResultArray(query), HandlerDef(this.getClass.getClassLoader, "", "controllers.Search", "getResultArray", Seq(classOf[String]), "GET", """""", _prefix + """getArray/$query<[^/]+>""")
)
                      

// @LINE:12
def getSubCategories(cat:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.getSubCategories(cat), HandlerDef(this.getClass.getClassLoader, "", "controllers.Search", "getSubCategories", Seq(classOf[String]), "GET", """""", _prefix + """getSubCategories/$cat<[^/]+>""")
)
                      

// @LINE:11
def getCategories(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.getCategories(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Search", "getCategories", Seq(), "GET", """""", _prefix + """getCategories""")
)
                      

// @LINE:7
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.search(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Search", "search", Seq(), "GET", """""", _prefix + """search""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    
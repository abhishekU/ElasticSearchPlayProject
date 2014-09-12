// @SOURCE:/Users/abhishek/Abhishek/myApp/conf/routes
// @HASH:ea3e46cdede25e8bd7eb94e4236f25ef687c82d9
// @DATE:Wed Sep 10 11:19:33 IST 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Search_search1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
private[this] lazy val controllers_Search_search1_invoker = createInvoker(
controllers.Search.search(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Search", "search", Nil,"GET", """""", Routes.prefix + """search"""))
        

// @LINE:9
private[this] lazy val controllers_Assets_at2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:10
private[this] lazy val controllers_Search_getResultArray3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getArray/"),DynamicPart("query", """[^/]+""",true))))
private[this] lazy val controllers_Search_getResultArray3_invoker = createInvoker(
controllers.Search.getResultArray(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Search", "getResultArray", Seq(classOf[String]),"GET", """""", Routes.prefix + """getArray/$query<[^/]+>"""))
        

// @LINE:11
private[this] lazy val controllers_Search_getCategories4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getCategories"))))
private[this] lazy val controllers_Search_getCategories4_invoker = createInvoker(
controllers.Search.getCategories(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Search", "getCategories", Nil,"GET", """""", Routes.prefix + """getCategories"""))
        

// @LINE:12
private[this] lazy val controllers_Search_getSubCategories5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getSubCategories/"),DynamicPart("cat", """[^/]+""",true))))
private[this] lazy val controllers_Search_getSubCategories5_invoker = createInvoker(
controllers.Search.getSubCategories(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Search", "getSubCategories", Seq(classOf[String]),"GET", """""", Routes.prefix + """getSubCategories/$cat<[^/]+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Search.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getArray/$query<[^/]+>""","""controllers.Search.getResultArray(query:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getCategories""","""controllers.Search.getCategories()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getSubCategories/$cat<[^/]+>""","""controllers.Search.getSubCategories(cat:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Search_search1_route(params) => {
   call { 
        controllers_Search_search1_invoker.call(controllers.Search.search())
   }
}
        

// @LINE:9
case controllers_Assets_at2_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:10
case controllers_Search_getResultArray3_route(params) => {
   call(params.fromPath[String]("query", None)) { (query) =>
        controllers_Search_getResultArray3_invoker.call(controllers.Search.getResultArray(query))
   }
}
        

// @LINE:11
case controllers_Search_getCategories4_route(params) => {
   call { 
        controllers_Search_getCategories4_invoker.call(controllers.Search.getCategories())
   }
}
        

// @LINE:12
case controllers_Search_getSubCategories5_route(params) => {
   call(params.fromPath[String]("cat", None)) { (cat) =>
        controllers_Search_getSubCategories5_invoker.call(controllers.Search.getSubCategories(cat))
   }
}
        
}

}
     
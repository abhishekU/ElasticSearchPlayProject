
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
object cookie extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jsonResult2: List[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <body>
    <div>
    """),_display_(/*6.6*/jsonResult2),format.raw/*6.17*/("""
   """),format.raw/*7.4*/("""</div>
    </body>
</html>"""))}
  }

  def render(jsonResult2:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(jsonResult2)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (jsonResult2) => apply(jsonResult2)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Sep 08 17:17:05 IST 2014
                  SOURCE: /Users/abhishek/Abhishek/myApp/app/views/cookie.scala.html
                  HASH: 744dcdf712df73049fa6c41b7ebc736c45b004dd
                  MATRIX: 730->1|845->28|872->29|946->78|977->89|1007->93
                  LINES: 26->1|29->1|30->2|34->6|34->6|35->7
                  -- GENERATED --
              */
          
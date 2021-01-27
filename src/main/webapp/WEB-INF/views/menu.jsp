
<div class="col-sm-12">
	<nav class="cbp-hsmenu-wrapper" id="cbp-hsmenu-wrapper">
		<div class="cbp-hsinner">
			<ul class="cbp-hsmenu">
				<li><a href="#">Sport e Salute</a>
					<ul class="cbp-hssubmenu">
						<li><a href="${pageContext.request.contextPath}/inviaspesemediche"><span>Crea File Per Spese Mediche</span></a></li>
					</ul></li>
				<li><a href="#">Coni</a>
					<ul class="cbp-hssubmenu cbp-hssub-rows">
						<li><a href="${pageContext.request.contextPath}/inviaspesemedicheconi"><span>Crea File Per Spese Mediche</span></a></li>
					</ul></li>
				<li><a href="#">Encrypt</a>
					<ul class="cbp-hssubmenu cbp-hssub-rows">
						<li><a href="${pageContext.request.contextPath}/encryptconi"><span>Cripta Pincode Coni</span></a></li>
						<li><a href="${pageContext.request.contextPath}/encryptsport"><span>Cripta Pincode Sport e Salute</span></a></li>
					</ul></li>
				 <li><a href="#">Esiti</a>
					<ul class="cbp-hssubmenu cbp-hssub-rows">
						<li><a href="${pageContext.request.contextPath}/esitispesemediche"><span>Esiti Spese Mediche</span></a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
</div>
<script src="/ConiSpeseMediche/_ui/js/cbpHorizontalSlideOutMenu.min.js"></script>
<script>
	var menu = new cbpHorizontalSlideOutMenu(document
			.getElementById('cbp-hsmenu-wrapper'));
</script>